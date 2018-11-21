package foo.bar

import com.thebund1st.daming.application.SmsVerificationSender
import com.thebund1st.daming.core.SmsVerification
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class WithTooManySmsVerificationSender {

    @Bean
    SmsVerificationSender anotherSmsVerificationSender() {
        new AnotherSmsVerificationSender()
    }

    @Bean
    SmsVerificationSender otherSmsVerificationSender() {
        new AnotherSmsVerificationSender()
    }

    static class AnotherSmsVerificationSender implements SmsVerificationSender {

        @Override
        void send(SmsVerification verification) {

        }
    }
}