/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitystudent;

/**
 *
 * @author maaz
 */
public class Modules {

    String name;
    String code;
    int credits;

    Modules(String code, String name, int credits) {
        this.name = name;
        this.code = code;
        this.credits = credits;
    }

    @Override
    public String toString() {

        return code + ", " + name + ", " + credits;

    }

}
