package nelson.choucair.questions;


import nelson.choucair.userinterface.AccessUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;




public class Answer implements Question<Boolean> {
    private String question;


    public Answer (String question){

        this.question=question;
    }



    public static Answer toThe(String question){

        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String accessuntest= Text.of(AccessUtest.BUTTONSIGNIN).viewedBy(actor).asString();
        if (question.equals(accessuntest)){
            result=true;
        }else{
            result=false;
        }
        return result;
    }
}
