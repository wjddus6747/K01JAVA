package quiz_game;
/*
 * 다음 Point클래스를 이용하여 다음 문제를 해결하시오.
 * 해당 문제는 상속을 통해 구현하는것이 아니라 구성관계를 이용하여 해결한다. 
 * Point 클래스를 기반으로 원을 의미하는 Circle클래스를 정의하자. 
 * 그리고 Circle클래스를 기반으로 Ring클래스를 정의하자.
실행결과]
안쪽원의 정보 :
반지름 : 3	
[x좌표:1, y좌표1]
바깥쪽원의 정보 :
반지름 : 9
[x좌표:2, y좌표2]
 */
class Point
{
	int xDot, yDot;

	public Point(int x, int y)
	{
		xDot = x;
		yDot = y;
	}

	public void showPointInfo()
	{
		System.out.println("[x좌표:" + xDot + ", y좌표" + yDot + "]");
	}
}

//Point클래스를 기반으로 원(Circle) 클래스 표현하기
class Circle
{
	// 멤버변수
	int radian;// 반지름
	Point center;

	//생성자
	/*
	 * 반지름을 표현하는 radian과 중심좌표를 표현한 point객체 생성
	 * point객체 생성을 위해서는 2개의 인자가 필요
	 */
	public Circle(int xDot, int yDot, int radian)
	{
		this.radian = radian;
		center = new Point(xDot, yDot);
	}
	
	public void showCircleInfo() {
		System.out.println("반지름:"+ radian);
		/*
		 * 원의 중심좌표 정보출력. 상속관계가 아니므로 객체를 이용헤서
		 * 멤버메소드 호출한다.
		 */
		center.showPointInfo();
	}
	
}

//원 2개를 겹쳐서 링을 표현하는 클래스
class Ring
{
	// 멤버변수
	Circle innerCircle;// 안쪽의 원
	Circle outerCircle;// 바깥쪽의 원
	//생성자
	/*
	 * 멤버변수인 2개의 Circle클래스의 객체를 생성한다
	 */
	public Ring(int inXDot, int inYDot, int inRadian,int oXDot, int oYDot, int oRadian) {
		innerCircle = new Circle(inXDot, inYDot, inRadian);
		outerCircle = new Circle(oXDot, oYDot, oRadian);
	}
	/*
	 * 링의 정보를 츨력을 위해 2개의 원의 멤버메소드를 호출
	 */
	public void showRingInfo()
	{
		System.out.println("안쪽원의 정보 :");
		innerCircle.showCircleInfo();
		
		System.out.println("안쪽원의 정보 :");
		outerCircle.showCircleInfo();
	}
}

class QuRingMake
{
	public static void main(String[] args)
	{
		Ring c = new Ring(1, 1, 3, 2, 2, 9);
		c.showRingInfo();
	}
}
