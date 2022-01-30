package com.example.bot;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "bot_config")
public class BotConfig {
    @Id
    private BigInteger id;

    //имя бота, которое вы указали при регистрации
    private String name = "BestWeather239bot";

    //токен
    private String accessToken = "5056913305:AAGIe3Fi25jLQWF-2pCwgTnh_Wx__EyFa_A";

    //http://api.openweathermap.org/data/2.5/weather?q={city}&appid=ВАШ_КЛЮЧ&units=metric&lang=ru
    private String nowWeatherApiTemp = "http://api.openweathermap.org/data/2.5/weather?q={city}&appid=b269754c91bec9173eff8bc9d07099da&units=metric&lang=ru";

    //подробнее о данной ссылке ниже
    //https://api.telegram.org/bot{token}/answerCallbackQuery?callback_query_id={id}
    private String telegramCallbackAnswerTemp = "https://api.telegram.org/bot{token}/answerCallbackQuery?callback_query_id={id}";

    private List<Command> commands;
}

