package lotto.random;

import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class LottoRandomStrategy implements LottoRandom {

    @Override
    public List<Integer> getLottoNumbers() {
        return Randoms.pickUniqueNumbersInRange(
            LOTTO_NUMBER_START_INCLUSIVE,
            LOTTO_NUMBER_END_INCLUSIVE,
            DEFAULT_COUNT
        );
    }
}
