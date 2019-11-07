package controller;

import service.RecentListService;
import service.RecentListServiceImpl;

public class TestClass {

	public static void main(String[] args) {
		RecentListService spListService = RecentListServiceImpl.getInstance();
		
		spListService.viewRecentList("admin");
	}

}
