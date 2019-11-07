/*
작성자 : 한승희
 */
package dao;

import java.util.HashMap;
import java.util.Set;

import vo.SPListVO;
import data.Database;

public class SPListDaoImpl implements SPListDao{

	private static SPListDaoImpl instance;
	
	private SPListDaoImpl(){
		
	}
	
	public static SPListDaoImpl getInstance(){
		if(instance == null)
		{
			instance = new SPListDaoImpl();
		}
		return instance;
	}
	
	Database database = Database.getInstance();

	@Override
	public SPListVO getSPList(String key, int value) {
		// TODO SPLISTNUM을 받아서 일치하는 배열리스트를 찾는다.
		for(int i=0;i<database.tb_spList.size();i++)
		{
			SPListVO splist = database.tb_spList.get(i);
			
			if(key.equals("SPLISTNUM"))
			{
				if(splist.getNumber()==value)
				{
					return splist;
				}
			}
		}
		
		return null;
	}

	@Override
	public SPListVO getSPList(HashMap<String, String> param) {
		// TODO HashMap형식 splist호출
		SPListVO rtnSPList = null;
		
		for(int i=0;i<database.tb_spList.size();i++)
		{
			SPListVO splist = database.tb_spList.get(i);
			boolean flag=true;
			
			Set<String> keys = param.keySet();
			for(String key : keys)
			{
				int value = Integer.parseInt(param.get(key));
				if(key.equals("SPLISTNUM"))
				{
					if(!(splist.getNumber()==value))
					{
						flag=false;
					}
				}
				if(flag)
				{
					rtnSPList = splist;
				}
			}
		}
		
		return rtnSPList;
	}

	@Override
	public void insertList(SPListVO splist) {
		//리스트 추가
		//userId, bookNumber, price, stock 넣을것.
		//number는 rtn값을 받아 +1하여 넣는다.
		//select값은 기본값인 false로 넣는다.
		database.tb_spList.add(splist);
	}

	@Override
	public int rtnSPListSize(String userId) {
		//SPList사이즈를 반환한다.
		int size = 0;
		
		for(int i=0;i<database.tb_spList.size();i++)
		{
			SPListVO splist = database.tb_spList.get(i);
			
			if(splist.getUserId().equals(userId))
			{
				size++;
			}
		}
		return size;
	}

	@Override
	public void deleteList(SPListVO splist) {		//도서 삭제
		//리스트 삭제 메서드
		database.tb_spList.remove(splist);
	}

	@Override
	public SPListVO getSPList(String key, boolean select) {
		//SPLISTNUM을 받아서 일치하는 배열리스트를 찾는다.
		for(int i=0;i<database.tb_spList.size();i++)
		{
			SPListVO splist = database.tb_spList.get(i);
			
			if(key.equals("SPLISTSEL"))
			{
				if(splist.isSelect()==select)
				{
					return splist;
				}
			}
		}
		return null;
	}

	@Override
	public SPListVO getSPList(int index) {
		SPListVO splist = database.tb_spList.get(index);
		return splist;
	}

	@Override
	public SPListVO getSPList(String key1, String userId, String key2, int number){
		//key1은 아이디, key2는 NUMBER
		for(int i=0;i<database.tb_spList.size();i++)
		{
			SPListVO splist = database.tb_spList.get(i);
			
			if(key1.equals("ID")&&key2.equals("NUMBER"))
			{
				if(splist.getUserId().equals(userId)&&splist.getNumber()==number)
				{
					return splist;
				}
			}
		}
		
		return null;
	}

	@Override
	public SPListVO getSPList(String key1, String userId, String key2,
			boolean select) {
		//ID와 select값을 받는다.
		for(int i=0;i<database.tb_spList.size();i++)
		{
			SPListVO splist = database.tb_spList.get(i);
			
			if(key1.equals("ID")&&key2.equals("SELECT"))
			{
				return splist;
			}
		}
		
		return null;
	}
}
