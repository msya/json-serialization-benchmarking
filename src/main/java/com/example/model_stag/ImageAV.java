package com.example.model_stag;

import com.vimeo.stag.UseStag;

@UseStag
public abstract class ImageAV {

    public abstract String id();

    public abstract String format();

    public abstract String url();

    public abstract String description();

}
