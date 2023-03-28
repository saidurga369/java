package lone_wolf.rest;


public enum Office {
	TRAINING_ROOM(24,"trainis"),PANTRY(10,"employes"),MANAGER_ROOM(3,"manager/staf"),CONFERENCE_ROOM(12,"employes"),LOBY(10,"all people");
	int siting;
	String access;
	private Office(int sitting,String access) 
	{
		this.siting = sitting;
		this.access = access;
	}
	
}
