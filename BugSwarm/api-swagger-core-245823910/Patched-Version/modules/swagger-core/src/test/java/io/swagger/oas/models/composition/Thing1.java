package io.swagger.oas.models.composition;

import io.swagger.oas.annotations.media.Schema;

@Schema(description = "Shake hands with Thing1"
//        , parent = AbstractBaseModelWithSubTypes.class
)
public class Thing1 extends AbstractBaseModelWithSubTypes {

    @Schema(description = "Override the abstract a")
    public String a;
    @Schema(description = "Thing1 has an additional field")
    public int x;
}
