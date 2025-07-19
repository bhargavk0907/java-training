package org.example.oops.innerclasses;

public class Hotel {


    public void bookRoom() {
        System.out.println("Room booked successfully!");
    }

    public void cancelRoom() {
        System.out.println("Room booking cancelled successfully!");
    }



    public class Room {
        private String roomType;
        private double price;

        public Room(String roomType, double price) {
            this.roomType = roomType;
            this.price = price;
        }

        // Default constructor

        public Room() {
            // Default constructor
        }

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }


        public class Test{

            public void testMethod() {
                System.out.println("This is a test method in the Test class.");
            }

        }

    }
}
