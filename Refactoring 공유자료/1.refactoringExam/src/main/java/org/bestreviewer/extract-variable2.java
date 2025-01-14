/*

void renderBanner() {

  if (((frame.isChanged || target.isChanged) || 
         experiment.isRunning()) &&
         (frame.getSize() == screen.getSize()))  {
    // Print banner.
  }
}

*/

void renderBanner() {
    if (shouldRenderBanner()) {
        // Print banner.
    }
}

private boolean shouldRenderBanner() {
    return isContentChanged() && isScreenSizeMatched();
}

private boolean isContentChanged() {
    return frame.isChanged || target.isChanged || experiment.isRunning();
}

private boolean isScreenSizeMatched() {
    return frame.getSize() == screen.getSize();
}
