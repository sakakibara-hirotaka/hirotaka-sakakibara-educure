package Main4;


public class Main4 {
    public static void main(String[] args) {

        PartyMember partyMember = new PartyMember("アリス");
        //PartyMember copy = partyMember.Clone();
        
        partyMember.skills.add("ファイア");
        partyMember.skills.add("ブリザード");
      

        System.out.println("--- 深いコピー後にスキル追加 ---");
        System.out.print("元のキャラクター");
        partyMember.showSkills();

        PartyMember copy = partyMember.Clone();
        copy.addSkill("サンダー");
        System.out.print("コピーしたキャラクター");
        copy.showSkills();
        

    }
}
