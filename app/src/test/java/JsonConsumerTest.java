import net.kbb3.codingtests.fuzzsimpleapptest.data.JsonConsumer;
import net.kbb3.codingtests.fuzzsimpleapptest.domain.Element;
import net.kbb3.codingtests.fuzzsimpleapptest.net.JsonDownloader;

import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kenneth Brewer on 4/29/2015.
 */
public class JsonConsumerTest {

    private StringReader stringReader;
    private Element[] data;
    @Before
    public void setUp() throws Exception {
        stringReader = new StringReader(jsonString);
        data = JsonConsumer.INSTANCE.consumeJSon(stringReader);
    }

    @Test
    public void TestJSonConsumer() {
        assertEquals(22,data.length);
    }


    private String jsonString = "[\n" +
            "  {\n" +
            "    \"id\": \"12\",\n" +
            "    \"type\": \"text\",\n" +
            "    \"date\": \"10/10/2010\",\n" +
            "    \"data\": \"This is a test\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"0\",\n" +
            "    \"type\": \"text\",\n" +
            "    \"date\": \"10/10/2014\",\n" +
            "    \"data\": \"Lorem Ipsum\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"5465465\",\n" +
            "    \"type\": \"image\",\n" +
            "    \"date\": \"8/4/2011\",\n" +
            "    \"data\": \"https://fuzzproductions.com/img/fuzz-logo.png\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"982\",\n" +
            "    \"type\": \"text\",\n" +
            "    \"date\": \"10/10/2012\",\n" +
            "    \"data\": \"Vestibulum nulla nulla, mattis ac convallis vel, rutrum quis elit. Donec quis ante elit. Nullam sodales nisi eu augue aliquet ultrices. Cras adipiscing mattis metus et pharetra. Cras sed sapien eu neque vulputate accumsan. Duis viverra suscipit fringilla. Proin augue urna, semper nec varius sit amet, viverra in nibh. Suspendisse gravida, dolor eu sollicitudin viverra, augue metus interdum tortor, id pellentesque neque justo ut ligula. Aliquam erat volutpat. Praesent blandit risus sed ligula cursus rhoncus. Phasellus adipiscing nibh et est pellentesque mattis. Proin consequat cursus velit, a sodales lacus ultricies ac. Aenean dapibus, justo vitae semper commodo, turpis odio blandit enim, eget ultricies lectus lacus non orci. Praesent nunc turpis, rutrum vel auctor ac, congue ut leo. Duis metus elit, pharetra non aliquam vel, auctor semper odio.\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"5500\",\n" +
            "    \"type\": \"text\",\n" +
            "    \"date\": \"1/10/2015\",\n" +
            "    \"data\": \"Cum sociis natoque penatibus\\n\\nNulla ornare iaculis<br>tortor at rhoncus. Nulla vitae congue leo.\\n\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"100\",\n" +
            "    \"type\": \"image\",\n" +
            "    \"date\": \"10/5/2011\",\n" +
            "    \"data\": \"http://I/dont/load/now/what\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"the_fuzz\",\n" +
            "    \"type\": \"image\",\n" +
            "    \"date\": \"2/1/2015\",\n" +
            "    \"data\": \"http://images.plixid.com/imager/w_500/h_/6a869efa5e7ae29a8dd05f2b8b8c7cab.jpg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"51\",\n" +
            "    \"type\": \"image\",\n" +
            "    \"date\": \"8/8/2014\",\n" +
            "    \"data\": \"http://quizzes.fuzzstaging.com/img/itunes_icon.jpeg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"44\",\n" +
            "    \"type\": \"image\",\n" +
            "    \"date\": \"12/10/2013\",\n" +
            "    \"data\": \"http://quizzes.fuzzstaging.com/img/itunes_icon.jpeg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"123\",\n" +
            "    \"type\": \"text\",\n" +
            "    \"date\": \"6/6/2010\",\n" +
            "    \"data\": \"Once upon a midnight dreary, while I pondered weak and weary,\\nOver many a quaint and curious volume of forgotten lore,\\nWhile I nodded, nearly napping, suddenly there came a tapping,\\nAs of some one gently rapping, rapping at my chamber door.\\n`'Tis some visitor,' I muttered, `tapping at my chamber door -\\nOnly this, and nothing more.'\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"50062\",\n" +
            "    \"type\": \"other\",\n" +
            "    \"date\": \"7/16/1987\",\n" +
            "    \"data\": \"Nothing\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"50655\",\n" +
            "    \"type\": \"image\",\n" +
            "    \"date\": \"10/20/1984\",\n" +
            "    \"data\": \"http://dev.fuzzproductions.com/iPhoneTest/itunes_icon_missing.jpeg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"-654\",\n" +
            "    \"date\": \"4/10/2013\",\n" +
            "    \"type\": \"text\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"hot_fuzz\",\n" +
            "    \"data\": \"http://www.filmedge.net/HotFuzz/downloads/01_1280.jpg\",\n" +
            "    \"type\": \"text\",\n" +
            "    \"date\": \"1/1/2015\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"0\",\n" +
            "    \"type\": \"text\",\n" +
            "    \"data\": \"\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"12123\",\n" +
            "    \"type\": \"image\",\n" +
            "    \"data\": \"http://www.android.com/media/wallpaper/gif/android_logo.gif\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"312312\",\n" +
            "    \"type\": \"image\",\n" +
            "    \"date\": \"\",\n" +
            "    \"data\": \"http://wpcdn.padgadget.com/wp-content/uploads/2010/09/twitter-for-ipad-icon.jpg\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"41241241\",\n" +
            "    \"type\": \"image\",\n" +
            "    \"date\": \"5/1/2013\",\n" +
            "    \"data\": \"http://cdn.software112.com/Desktop/Icons/Icons/69827-small-phone-icons.gif\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"568567346\",\n" +
            "    \"type\": \"image\",\n" +
            "    \"date\": \"12/25/2015\",\n" +
            "    \"data\": \"http://images-5.findicons.com/files/icons/1156/fugue/16/grid.png\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"352352352351241534645856856846856753467456745684679578096780678967893546\",\n" +
            "    \"type\": \"image\",\n" +
            "    \"date\": \"1/1/2055\",\n" +
            "    \"data\": \"http://rlv.zcache.com/fun_yellow_smiley_face_with_handlebar_mustache_sticker-rea187dba0bdc47a18c9036fbaab21128_v9waf_8byvr_512.jpg?bg=0xffffff\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"long_text\",\n" +
            "    \"type\": \"text\",\n" +
            "    \"date\": \"10/3/2013\",\n" +
            "    \"data\": \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed vehicula, eros ut dignissim lacinia, nibh velit aliquam urna, at egestas eros neque in augue. Vivamus in pellentesque tellus. Vivamus vehicula efficitur sapien vel tincidunt. Suspendisse dictum pharetra arcu vitae elementum. Maecenas ut sapien eu odio molestie sodales. Aliquam ut orci sed turpis placerat faucibus. Etiam quis velit et ipsum porta pellentesque. Suspendisse eu ligula sed elit consectetur porttitor sed congue ipsum. Praesent augue ante, luctus et varius ut, pharetra a mi. Sed et nulla blandit dui consequat tempor. Fusce tortor tellus, consectetur vel vestibulum et, facilisis nec turpis.\\n Fusce sodales suscipit commodo. Sed viverra vitae diam volutpat interdum. Sed ultrices leo id metus pretium, eu euismod enim venenatis. Sed a urna ut velit efficitur tincidunt. Aenean vitae neque et nisi laoreet consequat ac in ligula. Nam placerat neque nec auctor eleifend. Donec scelerisque arcu nunc, laoreet molestie sapien venenatis nec. In sit amet mollis diam. Vivamus et dui tortor. In mollis, lectus at placerat cursus, libero felis consectetur massa, vel dignissim erat sem vitae ante. Vivamus euismod vitae erat ut eleifend. Integer iaculis sapien vel quam elementum dignissim eget a tellus. Sed sit amet eleifend dolor.\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": \"128412382180928\",\n" +
            "    \"type\": \"image\",\n" +
            "    \"date\": \"1/1/2016\",\n" +
            "    \"data\": \"http://rsd.gsfc.nasa.gov/goes/pub/goes/080913.ike.poster.jpg\"\n" +
            "  }\n" +
            "]";
}
