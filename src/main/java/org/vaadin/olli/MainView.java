
package org.vaadin.olli;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.olli.foo.TestDesign;

/**
 * The main view contains a button and a click listener.
 */

@HtmlImport("frontend://bower_components/vaadin-lumo-styles/presets/compact.html")
@HtmlImport("styles/shared-styles.html")
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
        add(new TestDesign());
    }

}
