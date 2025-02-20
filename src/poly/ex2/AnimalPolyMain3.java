package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        //Caw caw = new Caw();
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck()};
        // 이렇게 쓸 수도 있음
        // 배열 객체 안에서 객체를 만듬
        //Inline Variable 단축키 -> option + command + n

        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

    }
    // Extract Method 메소드를 알아서 만들어줌 => option + command + m

    //변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물소리 테스트 시작");
        animal.sound();
        System.out.println("동물소리 테스트 시작");
    }

}
