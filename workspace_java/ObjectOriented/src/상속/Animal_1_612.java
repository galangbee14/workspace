package 상속;

public class Animal_1_612 {
    public static void main(String[] args) {

        //강아지 5마리 저장될 공간 생성
        Dog_612[] dogHouse = new Dog_612[5];
        Cat[] catHouse = new Cat[5];
        Cow[] cowHouse = new Cow[5];

        //강아지 객체 생성
        Dog_612 d1 = new Dog_612();
        dogHouse[0] = d1;
        Dog_612 d2 = new Dog_612();
        dogHouse[1] = d2;
        Dog_612 d3 = new Dog_612();
        dogHouse[2] = d3;

        Cat c1 = new Cat();
        Cat c2 = new Cat();
        catHouse[0] = c1;
        catHouse[1] = c2;

        Cow cow1 = new Cow();
        cowHouse[0] = cow1;

        for(int i = 0; i < 3; i++){
//            dogHouse[i].barkDog();
        }
        for(int i = 0; i < 2; i++){
//            catHouse[i].barkCat();
        }
        for(int i = 0; i < 1; i++){
//            cowHouse[i].barkCow();
        }
    }
}
