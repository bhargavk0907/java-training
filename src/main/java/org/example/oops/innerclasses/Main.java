package org.example.oops.innerclasses;

public class Main {


    static Pool pool = new Main().new Pool();



    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        hotel.bookRoom();

        Hotel.Room room = hotel.new Room("Deluxe", 150.0);
        System.out.println("Room Type: " + room.getRoomType());
        System.out.println("Price: $" + room.getPrice());

        hotel.cancelRoom();

        Hotel.Room room2 = hotel.new Room();
        room2.setRoomType("Standard");
        room2.setPrice(100.0);

        Hotel.Room.Test test = room2.new Test();

        pool.swim();
        testMethod();




    }

   public class Pool{

        public void swim() {
            System.out.println("Swimming in the pool");
        }


   }


   public static  void testMethod() {
        System.out.println("This is a test method in the Main class.");
    }









}
