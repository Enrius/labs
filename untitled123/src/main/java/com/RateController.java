package com;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rate")
public class RateController {

    // Для примера создаем статический список тарифов.
    private static final List<Rate> rates = new ArrayList<>();

    static {
        // Создаем компании
        Company company1 = new Company("Life");
        Company company2 = new Company("МТС");

        // Создаем тарифы и привязываем их к компаниям
        Rate rate1 = new Rate("Линейный тариф", company1);
        Rate rate2 = new Rate("Все за копейку", company2);

        // Добавляем тарифы к компаниям
        company1.addRate(rate1);
        company2.addRate(rate2);

        // Создаем абонентов и привязываем их к тарифам
        Subscriber subscriber1 = new Subscriber("Иванов Иван", "+375253456789", rate1);
        Subscriber subscriber2 = new Subscriber("Петров Петр", "+375257654321", rate1);
        Subscriber subscriber3 = new Subscriber("Сидоров Сидор", "+375335555555", rate2);

        // Добавляем абонентов к тарифам
        rate1.addSubscriber(subscriber1);
        rate1.addSubscriber(subscriber2);
        rate2.addSubscriber(subscriber3);

        // Добавляем тарифы в список
        rates.add(rate1);
        rates.add(rate2);
    }

    // Обработчик HTTP GET-запросов на URL "/rate"
    @RequestMapping(method = RequestMethod.GET)
    public String listRates(ModelMap model) {
        // Передаем список тарифов в модель
        model.addAttribute("rates", rates);
        // Возвращаем имя представления, которое будет отображать данные
        return "rate";
    }
}
