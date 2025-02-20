package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();


        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        //animal.sound();를 호출 했지만 메소드 오버라이딩 때문에 각자의 소리가 나온다.
        // 메소드 오버라이딩을 하면 항상 부모클래스에 sound 메소드리가 있더라도
        // 자식의 sound가 우선순위를 가지게 된다.
        System.out.println("동물 소리 테스트 종료");
    }
}
