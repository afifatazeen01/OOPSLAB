 class Monster {
   private String name;

   public Monster(String name) {
      this.name = name;
   }

   public String attack() {
      return " ";
   }
}
 
class FireMonster extends Monster{
     public FireMonster(String name){
     super(name);
     }
     public String attack(){
     return "Attack with Fire...";
     }
     }

class WaterMonster extends Monster{
        public WaterMonster(String name){
        super(name);
        }
        public String attack(){
        return "Attack with water...";
        }
        }
        
 class StoneMonster extends Monster{
        public StoneMonster(String name){
        super(name);
        }
        public String attack(){
        return "Attack with Stone...";
        }
        }     
        
 class MonsterTest{
    public static void main(String args[]){
    Monster m1=new FireMonster("Afifa");
    Monster m2=new WaterMonster("Tazeen");
    Monster m3=new StoneMonster("Fathima");
   
    System.out.println(m1.attack());
    System.out.println(m2.attack());
    System.out.println(m3.attack());
    m1=new StoneMonster("Aymen");
    System.out.println(m1.attack());
    Monster m4=new Monster("Ayesha");
    System.out.println(m4.attack());
}
}

