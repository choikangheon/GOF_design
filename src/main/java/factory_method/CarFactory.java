package factory_method;

public interface CarFactory {

    default Car orderCar(String name, String email){
        validate(name,email);
        prepareFor(name);
        Car car = createCar();
        sendEmailTo(email,car);
        return car;
    }

    private void sendEmailTo(String email, Car car){
        System.out.println(car + "만들어졌습니다.");
    }

    Car createCar();

    private void validate(String name,String email){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()){
            throw new IllegalArgumentException("연락처를 남겨주세요");
        }
    }

    private  void prepareFor(String name){
        System.out.println(name+ "만들 준비중");
    }

}