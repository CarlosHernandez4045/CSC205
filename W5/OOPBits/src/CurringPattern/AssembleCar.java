package W5.OOPBits.src.CurringPattern;

public class AssembleCar {
    CarAssemblyStep step = CarAssemblyStep.START;


    public AssembleCar brainstorm(){ 
        if(step != CarAssemblyStep.START) { 
            System.out.println("Failed. This step isn't ready yet! You're out of order, the correct step is: " + CarAssemblyStep.START.toString());

        } else { 
            System.out.println("Successfully did another step: " + CarAssemblyStep.BRAINSTORM.toString());
            step = CarAssemblyStep.BRAINSTORM;
        }
        return this;
    }

    public AssembleCar buildInternals(){ 
        if(step != CarAssemblyStep.BRAINSTORM) { 
            System.out.println("Failed. This step isn't ready yet! You're out of order, the correct step is: " + CarAssemblyStep.BRAINSTORM.toString());

        } else { 
            System.out.println("Successfully did another step: " + CarAssemblyStep.BUILD_INTERNALS.toString());
            step = CarAssemblyStep.BUILD_INTERNALS;
        }
        return this;
    }

    public AssembleCar buildBody(){ 
        if(step != CarAssemblyStep.BUILD_INTERNALS) { 
            System.out.println("Failed. This step isn't ready yet! You're out of order, the correct step is: " + CarAssemblyStep.BUILD_INTERNALS.toString());

        } else { 
            System.out.println("Successfully did another step: " + CarAssemblyStep.BUILD_BODY.toString());
            step = CarAssemblyStep.BUILD_BODY;
        }
        return this;
    }

    public AssembleCar putInternalsInBody(){ 
        if(step != CarAssemblyStep.BUILD_BODY) { 
            System.out.println("Failed. This step isn't ready yet! You're out of order, the correct step is: " + CarAssemblyStep.BUILD_BODY.toString());

        } else { 
            System.out.println("Successfully did another step: " + CarAssemblyStep.PUT_INTERNALS_IN_BODY.toString());
            step = CarAssemblyStep.PUT_INTERNALS_IN_BODY;
        }
        return this;
    }

    public AssembleCar qualityAssurance(){ 
        if(step != CarAssemblyStep.PUT_INTERNALS_IN_BODY) { 
            System.out.println("Failed. This step isn't ready yet! You're out of order, the correct step is: " + CarAssemblyStep.PUT_INTERNALS_IN_BODY.toString());

        } else { 
            System.out.println("Successfully did another step: " + CarAssemblyStep.QUALITY_ASSURANCE.toString());
            step = CarAssemblyStep.QUALITY_ASSURANCE;
        }
        return this;
    }

    public AssembleCar releaseProductCar(){ 
        if(step != CarAssemblyStep.QUALITY_ASSURANCE) { 
            System.out.println("Failed. This step isn't ready yet! You're out of order, the correct step is: " + CarAssemblyStep.QUALITY_ASSURANCE.toString());

        } else { 
            System.out.println("Successfully did another step: " + CarAssemblyStep.RELEASE_FINAL_PRODUCT.toString());
            step = CarAssemblyStep.RELEASE_FINAL_PRODUCT;
        }
        return this;
    }
}
