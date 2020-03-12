package ex17collection;
class Apple{
	int weight;
	public Apple(int w) {
		weight = w;
	}
	public void showInfo()
	{
		System.out.println("사과의 무게는:"+weight + "입니다.");
	}
}
class Banner{
	int suger;
	public Banner(int s) {
		suger = s;
	}
	public void showInfo()
	{
		System.out.println("바나나의 당도는:"+suger + "입니다.");
	}
}
/*
class FruitBox{
	Object item;
	public void store(Object item) {
		this.item = item;
	}
	public Object pullout() {
		return item;
	}
}

=> 기존 Object기반의 FruitBox를 아래와 같이 제네릭 클래스로 정의한다.
자료형에 해당하는 대분을 대표문자 T(Type)으로 교체하고, 객체생성시 자료형을 결정하기위해 
"클래스명<T>"형태로 변경한다.
 */
class GenericFruitBox<T>{
	T item;
	public void store(T item)
	{
		this.item = item;
	}
	public T pullout() {
		return item;
	}
}
public class Ex02GenericClass
{

	public static void main(String[] args)
	{
		/*
		 * 인스턴스 생성시 T부분을 결정하므로 구현의 편의성이 보장된다.
		 * 각각 Apple, Banner 객체를 저장할수 있는 인스턴스가 생성되었다.
		 */
		GenericFruitBox<Apple> appleBox = new GenericFruitBox<Apple>();
		appleBox.store(new Apple(10));
		Apple apple = appleBox.pullout();
		apple.showInfo();
		
		GenericFruitBox<Banner> bannerBox = new GenericFruitBox<Banner>();
		Banner banana = new Banner(20);
		bannerBox.store(banana);
		Banner banner = bannerBox.pullout();
		banana.showInfo();
		
		/*
		 OrangeBox는 인스턴스 생성시 Orange를 저장할수 있는 용도로
		 생성되었기 때문에 다른 객체는 저장할수 없다. 아래코드에서
		 컴파일에러가 발생되므로 지료형에도 안전한 코드가 된다.
		 */
		GenericFruitBox<Orange> orangeBox = new GenericFruitBox<Orange>();
//		orangeBox.store("나는 오랜지"); <= 컴파일 에러 발생
//		orangeBox.store(apple);
//		orangeBox.store(banner);
//		
	}

}
