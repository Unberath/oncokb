package org.mskcc.cbio.oncokb.apiModels;

import org.mskcc.cbio.oncokb.model.LevelOfEvidence;
import org.mskcc.cbio.oncokb.model.tumor_type.TumorType;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Hongxin Zhang on 2019-05-29.
 */
public class Implication {
    int evidneceId;
    LevelOfEvidence levelOfEvidence;
    Set<String> alterations = new HashSet<>();
    TumorType tumorType;
    String description = "";

    public int getEvidneceId() {
        return evidneceId;
    }

    public void setEvidneceId(int evidneceId) {
        this.evidneceId = evidneceId;
    }

    public LevelOfEvidence getLevelOfEvidence() {
        return levelOfEvidence;
    }

    public void setLevelOfEvidence(LevelOfEvidence levelOfEvidence) {
        this.levelOfEvidence = levelOfEvidence;
    }

    public Set<String> getAlterations() {
        return alterations;
    }

    public void setAlterations(Set<String> alterations) {
        this.alterations = alterations;
    }

    public TumorType getTumorType() {
        return tumorType;
    }

    public void setTumorType(TumorType tumorType) {
        this.tumorType = tumorType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
