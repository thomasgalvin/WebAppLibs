package weblib;

import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;

public class WebLibs
{
    public static final String CONTEXT_ROOT_ACE= "/ace";
    public static final String CONTEXT_ROOT_ANGULAR = "/ng";
    public static final String CONTEXT_ROOT_BOOTSTRAP = "/bootstrap";
    public static final String CONTEXT_ROOT_UI_BOOTSTRAP = "/ui-bootstrap";
    
    public static void registerAssetBundles( Bootstrap bootstrap ) {
        bootstrap.addBundle( new AssetsBundle( "/ace/1.1.9", CONTEXT_ROOT_ACE, "", "weblib-ace" ) );
        bootstrap.addBundle( new AssetsBundle( "/angular/1.4.2", CONTEXT_ROOT_ANGULAR, "", "weblib-angular" ) );
        bootstrap.addBundle( new AssetsBundle( "/bootstrap/3.3.5", CONTEXT_ROOT_BOOTSTRAP, "", "weblib-bootstrap" ) );
        bootstrap.addBundle( new AssetsBundle( "/ui-bootstrap/0.13.0", CONTEXT_ROOT_UI_BOOTSTRAP, "", "weblib-bootstrap-ui" ) );
    }
}
