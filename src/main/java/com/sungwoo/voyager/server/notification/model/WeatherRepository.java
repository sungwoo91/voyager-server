package com.sungwoo.voyager.server.notification.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface WeatherRepository extends JpaRepository<Weather, Long> {

}
