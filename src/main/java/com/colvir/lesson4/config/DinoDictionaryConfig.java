package com.colvir.lesson4.config;

import com.colvir.lesson4.model.Dinosaur;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ConcurrentHashMap;

@Configuration
public class DinoDictionaryConfig {

    @Bean
    ConcurrentHashMap<String, Dinosaur> DinoDictionary() {
        final ConcurrentHashMap<String, Dinosaur> dynoMap = new ConcurrentHashMap<>();

        dynoMap.put("Тираннозавр", Dinosaur.builder()
                        .ageAgoFrom(66)
                        .ageAgoTo(68)
                        .maxLength(12)
                        .maxHeight(6)
                        .description("Один из самых крупных хищников, мощные челюсти с зубами до 30 см.")
                        .build());

        dynoMap.put("Велоцираптор", Dinosaur.builder()
                .ageAgoFrom(71)
                .ageAgoTo(75)
                .maxLength(2)
                .maxHeight(1)
                .description("Быстрый, умный, с серповидным когтем на задних лапах.")
                .build());

        dynoMap.put("Трицератопс", Dinosaur.builder()
                .ageAgoFrom(66)
                .ageAgoTo(68)
                .maxLength(9)
                .maxHeight(3)
                .description("Травоядный, с тремя рогами и костяным \"воротником\".")
                .build());

        dynoMap.put("Стегозавр", Dinosaur.builder()
                .ageAgoFrom(145)
                .ageAgoTo(155)
                .maxLength(9)
                .description("Травоядный, с костяными пластинами на спине и шипами на хвосте.")
                .build());

        dynoMap.put("Брахиозавр", Dinosaur.builder()
                .ageAgoFrom(150)
                .ageAgoTo(154)
                .maxLength(25)
                .maxHeight(12)
                .description("Один из самых высоких динозавров, длинная шея для питания листьями деревьев.")
                .build());

        dynoMap.put("Птеродактиль", Dinosaur.builder()
                .ageAgoFrom(148)
                .ageAgoTo(150)
                .maxLength(1)
                .description("Летающий ящер, питался рыбой и мелкими животными.")
                .build());

        dynoMap.put("Анкилозавр", Dinosaur.builder()
                .ageAgoFrom(66)
                .ageAgoTo(68)
                .maxLength(8)
                .description("Травоядный, с бронированной спиной и костяной \"булавой\" на хвосте.")
                .build());

        dynoMap.put("Диплодок", Dinosaur.builder()
                .ageAgoFrom(152)
                .ageAgoTo(154)
                .maxLength(33)
                .description("Один из самых длинных динозавров, длинный хлыстообразный хвост.")
                .build());

        dynoMap.put("Аллозавр", Dinosaur.builder()
                .ageAgoFrom(145)
                .ageAgoTo(155)
                .maxLength(12)
                .description("Крупный хищник, возможно, охотился стаями.")
                .build());

        dynoMap.put("Спинозавр", Dinosaur.builder()
                .ageAgoFrom(93)
                .ageAgoTo(112)
                .maxLength(18)
                .description("Самый крупный хищный динозавр, полуводный образ жизни, \"парус\" на спине.")
                .build());

        dynoMap.put("Паразауролоф", Dinosaur.builder()
                .ageAgoFrom(73)
                .ageAgoTo(76)
                .maxLength(10)
                .description("Травоядный, с длинным полым гребнем, возможно, использовавшимся для звуковых сигналов.")
                .build());

        dynoMap.put("Археоптерикс", Dinosaur.builder()
                .ageAgoFrom(150)
                .ageAgoTo(150)
                .maxLength(1)
                .description("ернатый, возможно, умел планировать.")
                .build());

        return dynoMap;
    }
}
