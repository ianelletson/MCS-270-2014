
public class test {

	public static void main(String[] args) {
		int test1, test2 = 0;
		Client1 client1 = new Client1();
		test1 = client1.performCallBack(5);
		Client2 client2 = new Client2();
		test2 = client2.performCallBack(5);
		System.out.print("The result of Client1 is: \n");
		System.out.print(test1);
		System.out.print("\n");
		System.out.print("The result of Client2 is: \n");
		System.out.print(test2);
	}

}
