package ex12inheritance;
class Burger
{
	// 멤버변수
	/* 버거명, 가격, 패티, 소스, 야체를 표현 */
	private String BurgerName;
	private int price;
	private String pat;
	private String source;
	private String yache;

	// 인자생성자
	public Burger(String burgerName, int price, String pat, String source, String yache)
	{
		BurgerName = burgerName;
		this.price = price;
		this.pat = pat;
		this.source = source;
		this.yache = yache;
	}

	// getter : price만 필요
	public int getPrice()
	{
		return price;
	}

	// 햄버거 정보 출력
	/* 버거명, 가격, 식재료 출력 */
	public void showBurger()
	{
		System.out.println(BurgerName);
		System.out.println("가격:" + price);
		System.out.println("식재료:" + pat+"," + source+"," + yache);
	}
}

//햄버거의 기본가격 추상화 
class HamburgerPrice
{
	// 멤버변수
	/* 햄버거종류, 음료, 프렌치프라이 */
	Burger burger;
	final int COKE = 1000;
	final int POTATO = 1500;

	// 인자생성자 :상수는 이미 초기화되어 있으므로 햄버거객체만 초기화한다.
	public HamburgerPrice(Burger burger1)
	{
		burger = burger1;
	}

	// 기본가격계산 :햄버거의 price는private멤버이므로 getter를 통해 가져옴.
	public int burgerprice()
	{
		return burger.getPrice() + COKE + POTATO;
	}

	// 햄버거와 결제금액 출력
	public void showPrice()
	{
		burger.showBurger();
		System.out.println("결제금액:" + burgerprice());
		System.out.println("==================");
	}
}


class SetPrice extends HamburgerPrice
{
	// 인자생성자
	public SetPrice(Burger burger2)
	{
		super(burger2);
	}

	// 세트가격계산(오버라이딩):500원 할인된 가격을 계산
	@Override
	public int burgerprice()
	{	//부모의 계산결과에서 500원 차감
		return super.burgerprice() - 500;
	}

	// 햄버거와 세트결제금액 출력(오버라이딩)
	@Override
	public void showPrice()
	{
		burger.showBurger();
		System.out.println("세트결제금액:" + burgerprice());
		System.out.println("==================");
	}
}

public class QuBuyHamburger
{

	public static void main(String[] args)
	{

		// 치즈버거 객체 생성
		Burger burger1 = new Burger("치즈버거", 2000, "쇠고기패티", "케챱", "피클");
		// 치킨버거 객체 생성
		Burger burger2 = new Burger("치킨버거", 3000, "닭고기패티", "마요네즈", "양상치");

		// 치즈버거를 기본가격으로 구매
		HamburgerPrice price1 = new HamburgerPrice(burger1);
		price1.showPrice(); // 4500원

		// 치킨버거를 세트가격으로 구매
		HamburgerPrice price2 = new SetPrice(burger2);
		price2.showPrice(); // 5000원
	}
}
