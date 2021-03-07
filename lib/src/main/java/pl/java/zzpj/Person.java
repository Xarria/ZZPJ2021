package pl.java.zzpj;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    String name;

    public String sayHi(){
        return "Good Morning! My name is " + name;
    }

}