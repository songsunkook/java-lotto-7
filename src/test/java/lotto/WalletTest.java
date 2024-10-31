package lotto;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

import org.junit.jupiter.api.Test;

class WalletTest {

    @Test
    void 구입_금액에_맞는_로또를_발행한다() {
        Wallet wallet = new Wallet(3000);
        wallet.buyLottoTickets();
        assertThat(wallet.getLottoTicketCounts()).isEqualTo(3);
    }

    @Test
    void 구입_금액이_나누어떨어지지_않으면_예외를_반환한다() {
        assertThatThrownBy(() -> new Wallet(3333))
            .isInstanceOf(IllegalArgumentException.class);
    }
}
