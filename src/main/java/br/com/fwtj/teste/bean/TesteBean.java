package br.com.fwtj.teste.bean;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.time.LocalDateTime;

@Named
@ViewScoped
public class TesteBean implements Serializable {

    public void forInfinito() throws InterruptedException {
        for (; ; ) {
            Thread.sleep(1000);
            System.out.println(LocalDateTime.now());
        }
    }

}
