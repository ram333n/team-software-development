package com.prokopchuk.tgbotpersonalassistant.notification.repository;

import com.prokopchuk.tgbotpersonalassistant.notification.domain.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
