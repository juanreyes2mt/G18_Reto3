package g18.reto3;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import g18.reto3.interfaces.InterfaceOrder;
import g18.reto3.interfaces.InterfaceProduct;
import g18.reto3.interfaces.InterfaceUser;

@Component
@SpringBootApplication
public class Reto3Application implements CommandLineRunner {
	@Autowired
	private InterfaceProduct interfaceProduct;
	@Autowired
	private InterfaceUser interfaceUser;
	@Autowired
    private InterfaceOrder interfaceOrder;
	public static void main(String[] args) {
		SpringApplication.run(Reto3Application.class, args);
	}

	@Override
	public void run(String...args) throws Exception {
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		interfaceProduct.deleteAll();
		interfaceUser.deleteAll();
		interfaceOrder.deleteAll();
	}
}
