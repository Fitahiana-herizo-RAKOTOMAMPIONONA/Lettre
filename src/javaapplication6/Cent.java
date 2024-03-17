package javaapplication6;
/**
 *
 * @author Herizo
 */
public class Cent {
    public int chiffre ;
    public int centaine ;
    public int dizaine ;
    public int unite ;
    public Cent (int x){
      this.chiffre = x;
       unite = (chiffre%100)%10;
       dizaine = (chiffre%100)/10;
       centaine = chiffre/100;
    }
    public String lettre(int x){
        switch (x) {
            case 1 : return "un " ;
            case 2 : return "deux ";
            case 3 : return "trois ";
            case 4 : return "quatre ";
            case 5 : return "cinq ";
            case 6 : return "six ";
            case 7 : return "sept ";
            case 8 : return "huit ";
            case 9 : return "neuf ";
            default : return " ";
        }
    }
    public String lettreDizaine(int x){
        switch (x) {
            case 1 : return "dix " ;
            case 2 : return "vingt ";
            case 3 : return "trente ";
            case 4 : return "quarante ";
            case 5 : return "cinquante ";
            case 6 : return "soixante ";
            case 7 : return "soixante ";
            case 8 : return "quatre vingt ";
            case 9 : return "quatre vingt dix ";
            default :    return "";
        }
    }
    public String exeption(int x){
        switch (x) {
            case 11: return "onze " ;
            case 12: return "douze ";
            case 13: return "treize ";
            case 14: return "quatorze ";
            case 15: return "quize ";
            case 16: return "seize ";
            default: return " ";
        }
       
    }
    public String toLettre (){
        centaine = centaine ==1?12:centaine;
        if (centaine ==0){
            if (dizaine==0) return lettre(unite);
            else if ((dizaine*10)+unite>10 && (dizaine*10)+unite <17) return exeption((dizaine*10)+unite);
            else if ((dizaine*10)+unite>90 && (dizaine*10)+unite <97) return lettreDizaine(dizaine-1)+ exeption(((dizaine*10)+unite)-80) ;
            else return lettreDizaine(dizaine) + lettre(unite);
        }else{
            String aide = "cent ";
            if (dizaine==0) return lettre(centaine) + aide +lettre(unite);
            else if ((dizaine*10)+unite>10 && (dizaine*10)+unite <17) return lettre(centaine) + aide + exeption((dizaine*10)+unite);
            else if ((dizaine*10)+unite>90 && (dizaine*10)+unite <97) return lettre(centaine) + aide+ lettreDizaine(dizaine-1)+ exeption(((dizaine*10)+unite)-80) ;
            else return lettre(centaine) + aide + lettreDizaine(dizaine) + lettre(unite);
        }
    }
    public void Getchiffre(){
        System.out.println(centaine + "  " + dizaine + "  " + unite);
        if ((dizaine*10)+unite>90 && (dizaine*10)+unite <97)  System.out.println("izy"); 
        System.out.println(dizaine*10 + unite);
    }
    public String toLettreAvecChiffre (){
        return chiffre + " " + toLettre();
    }
}
