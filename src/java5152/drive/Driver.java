package java5152.drive;

/**
 * 类：司机，具有驾驶能力
 */
public class Driver {

	private Drive drive;

	public void setDrive(Drive drive) {
		this.drive = drive;
	}

	public void drive(){
		drive.drive();
	}

}
