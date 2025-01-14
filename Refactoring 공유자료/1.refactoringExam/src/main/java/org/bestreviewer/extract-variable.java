/*

void renderBanner() {
  if ((platform.toUpperCase().indexOf("MAC") > -1) &&
       (browser.toUpperCase().indexOf("IE") > -1) &&
        wasInitialized() && resize > 0 )
  {
    // do something
  }
}

*/

void renderBanner() {
    if (shouldRenderBanner()) {
        // do something
    }
}

private boolean shouldRenderBanner() {
    return isMacPlatform() && isIEBrowser() && wasInitialized() && resize > 0;
}

private boolean isMacPlatform() {
    return platform.toUpperCase().contains("MAC");
}

private boolean isIEBrowser() {
    return browser.toUpperCase().contains("IE");
}
