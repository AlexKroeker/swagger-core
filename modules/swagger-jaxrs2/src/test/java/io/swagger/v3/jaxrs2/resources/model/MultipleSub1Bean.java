package io.swagger.v3.jaxrs2.resources.model;

@io.swagger.v3.oas.annotations.media.Schema(
        description = "MultipleSub1Bean",
        subTypes = MultipleSubSub1Bean.class
)
public class MultipleSub1Bean extends MultipleBaseBean {
    public int c;
}