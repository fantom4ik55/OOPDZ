public class main {

        public static void main(String[] args) {
    
            Market market = new Market();
            Human human1 = new Human("Владимир Владимирович");
            Human human2 = new Human("Джо Байдон");
    
            market.acceptToMarket(human2);
            market.acceptToMarket(human1);
            market.update();
    
        }
}
    

