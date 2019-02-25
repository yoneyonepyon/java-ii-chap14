
public class Kinko implements Lockable {

	@Override
	public boolean lock() {
		return false;
	}

	@Override
	public boolean unlock() {
		return false;
	}

	public static void main(String[] args) {
		Kinko kinko = new Kinko();
		System.out.println(kinko.lock());
		System.out.println(kinko.unlock());
	}

}
