package co.com.tevolvers.test.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ResponseMessage implements Question<Integer> {

    private Integer element;
    ResponseMessage(Integer element){
        this.element = element;
    }

    @Override
    public Integer answeredBy(Actor actor) {
        return this.element;
    }

    public static ResponseMessage is(Integer element){
        return new ResponseMessage(element);
    }
}
