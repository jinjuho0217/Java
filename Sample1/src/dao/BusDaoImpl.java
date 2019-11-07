package dao;

import java.util.ArrayList;
import java.util.Scanner;

import vo.BusVo;
import data.Database;

public class BusDaoImpl implements BusDao {
	
	private static BusDaoImpl instance;
	private BusDaoImpl(){
		
	}

	public static BusDaoImpl getInstance() {
		if (instance == null) {
			instance = new BusDaoImpl();
		}
		return instance;
	}
	
	
	Database database = Database.getInstance();

	
	

	@Override
	public ArrayList<BusVo> selectBusList() { //버스 전체 리스트
	
		return database.tb_bus;
	}

	@Override
	public void insertBus(BusVo bv) { //버스추가
		database.tb_bus.add(bv);

	}

	@Override
	public void deleteBus(int bv) { //버스삭제
		database.tb_bus.remove(bv);

	}

	@Override
	public void modifyBus(BusVo bv) { //버스수정
		for(int i = 0; i<database.tb_bus.size();i++){
			if(database.tb_bus.get(i).getBusNum()==bv.getBusNum()){
				database.tb_bus.remove(i);
				break;
			}
		}
		database.tb_bus.add(bv);
	}

	@Override
	public BusVo selectBus(String key, int value) { //선택한 버스 라이센스 출력
		
//		Scanner s = new Scanner(System.in);
//		
//		ArrayList<BusVo> busList = B
//		
		
		
		return null;
	}



	

	

	


}
