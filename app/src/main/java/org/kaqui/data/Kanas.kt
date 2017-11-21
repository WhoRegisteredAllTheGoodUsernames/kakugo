package org.kaqui.data

data class RawKana(val kana: String, val romaji: String)
data class SimilarKana(val kana: String, val similar: String)

val Hiraganas = arrayOf(
        RawKana("あ", "a"),
        RawKana("い", "i"),
        RawKana("う", "u"),
        RawKana("え", "e"),
        RawKana("お", "o"),
        RawKana("か", "ka"),
        RawKana("き", "ki"),
        RawKana("く", "ku"),
        RawKana("け", "ke"),
        RawKana("こ", "ko"),
        RawKana("さ", "sa"),
        RawKana("し", "shi"),
        RawKana("す", "su"),
        RawKana("せ", "se"),
        RawKana("そ", "so"),
        RawKana("た", "ta"),
        RawKana("ち", "chi"),
        RawKana("つ", "tsu"),
        RawKana("て", "te"),
        RawKana("と", "to"),
        RawKana("な", "na"),
        RawKana("に", "ni"),
        RawKana("ぬ", "nu"),
        RawKana("ね", "ne"),
        RawKana("の", "no"),
        RawKana("は", "ha"),
        RawKana("ひ", "hi"),
        RawKana("ふ", "fu"),
        RawKana("へ", "he"),
        RawKana("ほ", "ho"),
        RawKana("ま", "ma"),
        RawKana("み", "mi"),
        RawKana("む", "mu"),
        RawKana("め", "me"),
        RawKana("も", "mo"),
        RawKana("や", "ya"),
        RawKana("ゆ", "yu"),
        RawKana("よ", "yo"),
        RawKana("ら", "ra"),
        RawKana("り", "ri"),
        RawKana("る", "ru"),
        RawKana("れ", "re"),
        RawKana("ろ", "ro"),
        RawKana("わ", "wa"),
        RawKana("を", "wo"),
        RawKana("ん", "n")
)

val SimilarHiraganas = arrayOf(
        SimilarKana("あ", "お"),
        SimilarKana("あ", "や" /* ヤ */),

        SimilarKana("い", "り"),

        SimilarKana("う", "つ"),
        SimilarKana("う", "ら" /* ラ */),

        SimilarKana("き", "さ"),
        SimilarKana("き", "ま"),

        SimilarKana("く", "へ"),

        SimilarKana("せ", "さ" /* サ */),

        SimilarKana("さ", "ち"),

        SimilarKana("し", "れ" /* レ */),

        SimilarKana("す", "お"),
        SimilarKana("す", "む"),

        SimilarKana("そ", "ろ"),

        SimilarKana("つ", "ふ" /* フ */),

        SimilarKana("の", "め"),
        SimilarKana("の", "ぬ"),
        SimilarKana("め", "ぬ"),

        SimilarKana("わ", "ね"),
        SimilarKana("わ", "れ"),
        SimilarKana("ね", "れ"),

        SimilarKana("ま", "は"),
        SimilarKana("ま", "ほ"),
        SimilarKana("は", "ほ"),

        SimilarKana("る", "ろ")
)

val Katakanas = arrayOf(
        RawKana("ア", "a"),
        RawKana("イ", "i"),
        RawKana("ウ", "u"),
        RawKana("エ", "e"),
        RawKana("オ", "o"),
        RawKana("カ", "ka"),
        RawKana("キ", "ki"),
        RawKana("ク", "ku"),
        RawKana("ケ", "ke"),
        RawKana("コ", "ko"),
        RawKana("サ", "sa"),
        RawKana("シ", "shi"),
        RawKana("ス", "su"),
        RawKana("セ", "se"),
        RawKana("ソ", "so"),
        RawKana("タ", "ta"),
        RawKana("チ", "chi"),
        RawKana("ツ", "tsu"),
        RawKana("テ", "te"),
        RawKana("ト", "to"),
        RawKana("ナ", "na"),
        RawKana("ニ", "ni"),
        RawKana("ヌ", "nu"),
        RawKana("ネ", "ne"),
        RawKana("ノ", "no"),
        RawKana("ハ", "ha"),
        RawKana("ヒ", "hi"),
        RawKana("フ", "fu"),
        RawKana("ヘ", "he"),
        RawKana("ホ", "ho"),
        RawKana("マ", "ma"),
        RawKana("ミ", "mi"),
        RawKana("ム", "mu"),
        RawKana("メ", "me"),
        RawKana("モ", "mo"),
        RawKana("ヤ", "ya"),
        RawKana("ユ", "yu"),
        RawKana("ヨ", "yo"),
        RawKana("ラ", "ra"),
        RawKana("リ", "ri"),
        RawKana("ル", "ru"),
        RawKana("レ", "re"),
        RawKana("ロ", "ro"),
        RawKana("ワ", "wa"),
        RawKana("ヲ", "wo"),
        RawKana("ン", "n")
)

val SimilarKatakanas = arrayOf(
        SimilarKana("ア", "ヤ"),

        SimilarKana("ウ", "ワ"),
        SimilarKana("ラ", "ウ" /* う */),

        SimilarKana("オ", "ホ"),

        SimilarKana("ク", "ケ"),
        SimilarKana("ク", "タ"),

        SimilarKana("コ", "ユ"),

        SimilarKana("サ", "セ" /* せ */),

        SimilarKana("シ", "ツ"),
        SimilarKana("シ", "ソ"),
        SimilarKana("シ", "ノ"),
        SimilarKana("シ", "ン"),
        SimilarKana("ツ", "ソ"),
        SimilarKana("ツ", "ノ"),
        SimilarKana("ツ", "ン"),
        SimilarKana("ソ", "ノ"),
        SimilarKana("ソ", "ン"),
        SimilarKana("ノ", "ン"),

        SimilarKana("セ", "ヒ"),

        SimilarKana("チ", "テ"),

        SimilarKana("ナ", "メ"),

        SimilarKana("フ", "ツ" /* つ */),

        SimilarKana("レ", "シ" /* し */)
)
