package ex19thread;

/*
쓰레드로 구현하지 않은 클래스
	: 하나의 클래스가 작업을 끝내야 다음 클래스의 작업을
	진행할 수 있다. 즉 동시에 작업을 진행할 수 없다.
 */
class NotThread {
	String title;
	public NotThread(String title) {
		this.title = title;
	}
	void notThreadMethod() {
		for(int i=1 ; i<=10 ; i++) {
			System.out.println(String.format("%s]i=%d", title, i));
		}
	}
}

/*
독립쓰레드(Non Daemon Thread)
	: 메인쓰레드와 working쓰레드(개발자가 정의한 쓰레드)를
	일컫는 것으로 메인쓰레드가 종료되어도 계속 실행되며, dead
	상태가 되어야 실행이 종료되는 쓰레드를 말한다.
	해당 쓰레드는 main()메소드가 종료된 이후에도 실행되는것을
	볼 수 있다.
 */
class YesThread extends Thread {
	
	/*
	쓰레드 생성시 이름을 지정하지 않으면 JVM이 자동으로
	이름을 부여한다.
	 */
	public YesThread() {
		
	}
	
	/*
	Thread클래스의 생성자를 호출할때 전달하는 매개변수를 통해
	해당 쓰레드의 이름을 지정할 수 있다. 지정된 이름은 getName()을
	통해 반환할 수 있다.
	 */
	public YesThread(String threadName) {
		super(threadName);
	}
	void threadMethod() throws InterruptedException {
		for(int i=1 ; i<=10 ; i++) {
			//해당 클래스의 이름과 증가하는 변수 i를 출력한다.
			System.out.println(String.format("%s]i=%d", getName(), i));
			sleep(2000);//2초에 한번씩 Block상태가 된다.
		}
	}
	
	@Override
	public void run() {
		try {
			threadMethod();
		}
		catch(InterruptedException e) {
			
		}
	}
}

/*
종속쓰레드(Daemon thread)
	: 모든 독립쓰레드가 종료되면 자동으로 종료되는 쓰레드를 말한다.
	주로 프로그램의 보조역할로 배경음악, 로그자동저장 등의 업무를
	처리한다. 프로그램이 종료될때 자동으로 종료되므로 주로 무한루프로
	구성한다. setDaemont(true) 메소드로 설정한다.
 */
class DaemonThread extends Thread {
	
	@Override
	public void run() {
		while(true) {
			System.out.println(String.format("[쓰레드명:%s]Jazz가 흘러요~", getName()));
			try {
				sleep(3000);
				System.out.println("3초마다 자동저장!");
			}
			catch(InterruptedException e) {
				System.out.println("자동저장시 오류발생 ㅜㅜ");
			}
		}
	}
}


public class Ex03DaemonThread {

	public static void main(String[] args) {
		
		//쓰레드로 구현하지 않은 클래스의 작업
		NotThread nt1 = new NotThread("첫번째 클래스");
		nt1.notThreadMethod();
		
		NotThread nt2 = new NotThread("두번째 클래스");
		nt2.notThreadMethod();
		/*
		1번 객체가 종료되면 2번객체가 실행되는 일반적인 형태로 실행된다.
		 */
		
		
		
		//독립쓰레드(Non Daemon Thread) 실행
		YesThread yt1 = new YesThread("1st 쓰레드");//생성자를 통해 이름 부여
		//yt1.setName("첫번째쓰레드");//메소드를 통해 쓰레드의 이름 부여
		yt1.start();
		
		YesThread yt2 = new YesThread();//이름이 지정되지 않으면 자동으로 부여됨
		yt2.setPriority(Thread.MAX_PRIORITY);//우선순위 10으로 지정
		yt2.start();
		
		
		
		//종속쓰레드 생성 및 실행
		DaemonThread dt = new DaemonThread();
		//dt.setName("난 데몬쓰레드");
		dt.setDaemon(true);//독립쓰레드를 데몬쓰레드로 만들어준다. (true)
		dt.start();
		
		System.out.println("현재 활성화된상태의 쓰레드수"+ Thread.activeCount());
		System.out.println("현재 실행중인 쓰레드명"+ Thread.currentThread().getName());
		System.out.println("메인함수의 우선순위"+ Thread.currentThread().getPriority());
		System.out.println("메인함수(Main Threa) 종료");
		
	}

}
