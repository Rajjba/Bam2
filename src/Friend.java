public class Friend {
        String name;
        double hp;
        boolean isFriend = true;

        public Friend(String name) {
            this.name = name;
        }

        public Friend(String name, boolean isFriend){
            this.name = name;
            this.isFriend = isFriend;
        }

        public int GetHP(){
            return (int) hp;
        }
        public void SetHP(double hp){
            this.hp = hp;
        }
        public void DMG(double DMG){
            this.hp = hp-DMG;
        }
    }
