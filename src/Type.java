import java.util.Arrays;

public class Type {
    private Type[] typeWeakness;
    private Type[] typeAdvantage;
    private String type;

    Type(){

    }

    Type(String typeName){
        type = typeName;
    }
    Type(String t, Type[] weakness, Type[] advantage){
        type = t;
        typeWeakness = weakness;
        typeAdvantage = advantage;
    }

    public void setWeakness(Type weakness[]){
        typeWeakness = weakness;
    }

    public void setTypeAdvantage(Type advantage[]){
        typeAdvantage = advantage;
    }

    public String getType(){
        return type;
    }

    public String getWeaknesses(){
        String weaknesses = "";
        try {
            for (int i = 0; i < 18; i++) {
                weaknesses = weaknesses + " " + typeWeakness[i].getType();
            }
        }catch(Exception e){
            return weaknesses;
        }
        return weaknesses;
    }

    public String getTypeAdvantages(){
        String typeAdvantages = "";
        try {
            for (int i = 0; i < 18; i++) {
                typeAdvantages = typeAdvantages + " " + typeAdvantage[i].getType();
            }
        }catch(Exception e){
            return typeAdvantages;
        }
        return typeAdvantages;
    }

    public double getEffectiveness(Type[] atkType, Type[] defType){
        double effectiveness = 1;
        for(int j = 0; j<atkType.length; j++) {
            for (int i = 0; i < defType.length; i++) {
                if (Arrays.asList(atkType[j].typeAdvantage).contains(defType[i])){
                    effectiveness*=2;
                }
            }
        }
        for(int j = 0; j<atkType.length; j++) {
            for (int i = 0; i < defType.length; i++) {
                if (Arrays.asList(atkType[j].typeWeakness).contains(defType[i])){
                    effectiveness/=2;
                }
            }
        }
        return effectiveness;
    }

}
