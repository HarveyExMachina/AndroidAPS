package info.nightscout.androidaps.plugins.general.automation.elements;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import info.nightscout.androidaps.MainApp;

@RunWith(PowerMockRunner.class)
@PrepareForTest({MainApp.class})
public class LayoutBuilderTest {
    LayoutBuilder layoutBuilder = new LayoutBuilder();

    @Test
    public void addTest() {
        InputInsulin inputInsulin = new InputInsulin();
        layoutBuilder.add(inputInsulin);
        Assert.assertEquals(1, layoutBuilder.mElements.size());
    }
}