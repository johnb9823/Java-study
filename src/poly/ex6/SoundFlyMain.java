package poly.ex6;


public class SoundFlyMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();
        //단축키 option + command + v

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        flyAnimal(bird); // 따지면 얘는 부모가 두개다
        flyAnimal(chicken);
        //flyAnimal(dog); 는 사용 불가
        // 개 클래스에서 implement Fly를 하지 않았기 때문에
    }

    //AbstractAnimal 사용 가능
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");

    }

    //Fly 인터페이스가 있으면 사용 가능
    private static void flyAnimal(Fly fly) {
        System.out.println("날기 테스트 시작");
        fly.fly();
        System.out.println("날기 테스트 종료");
    }
}
