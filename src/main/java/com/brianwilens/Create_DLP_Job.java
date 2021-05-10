package com.brianwilens;

import com.brianwilens.Create_DLP_Job.GCSEvent;
//import com.google.api.services.storage.Storage;
import com.google.cloud.storage.*;
import com.google.cloud.dlp.v2.DlpServiceClient;
import com.google.cloud.functions.BackgroundFunction;
import com.google.cloud.functions.Context;
import com.google.privacy.dlp.v2.CloudStorageOptions;
import com.google.privacy.dlp.v2.InfoType;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class Create_DLP_Job implements BackgroundFunction<GCSEvent> {
    private static final Logger logger = Logger.getLogger(Create_DLP_Job.class.getName());
    @Override
    public void accept(GCSEvent event, Context context) throws IOException {
        logger.info("Processing file: " + event.bucket);
        /*
                # ----------------------------
                #  User-configurable Constants

                PROJECT_ID = '[PROJECT_ID_HOSTING_STAGING_BUCKET]'
                """The bucket the to-be-scanned files are uploaded to."""
                STAGING_BUCKET = '[YOUR_QUARANTINE_BUCKET]'
                """The bucket to move "sensitive" files to."""
                SENSITIVE_BUCKET = '[YOUR_SENSITIVE_DATA_BUCKET]'
                """The bucket to move "non sensitive" files to."""
                NONSENSITIVE_BUCKET = '[YOUR_NON_SENSITIVE_DATA_BUCKET]'
                """ Pub/Sub topic to notify once the  DLP job completes."""
                PUB_SUB_TOPIC = '[PUB/SUB_TOPIC]'
                """The minimum_likelihood (Enum) required before returning a match"""
                """For more info visit: https://cloud.google.com/dlp/docs/likelihood"""
                MIN_LIKELIHOOD = 'POSSIBLE'
                """The maximum number of findings to report (0 = server maximum)"""
                MAX_FINDINGS = 0
                """The infoTypes of information to match"""
                """For more info visit: https://cloud.google.com/dlp/docs/concepts-infotypes"""
                INFO_TYPES = [
                    'FIRST_NAME', 'PHONE_NUMBER', 'EMAIL_ADDRESS', 'US_SOCIAL_SECURITY_NUMBER'
                ]

                # End of User-configurable Constants
                # ----------------------------------

         */
//        try(DlpServiceClient dlp = DlpServiceClient.create()){
//            CloudStorageOptions cloudStorageOptions =
//                    CloudStorageOptions.newBuilder()
//                            .setFileSet(CloudStorageOptions.FileSet.newBuilder()
//                                    .setUrl()
//                                    .build())
//                            .build();
//        }

    }

    public void create_DLP_Job(GCSEvent event) {
        // Get the target file from the landing bucket
        String fileName = event.name;
        logger.info(String.format("Function triggered for file %s", fileName));
        // Prepare infoTypes object
        //List<InfoType> infoTypes =
    }

    public static class GCSEvent {
        String bucket;
        String name;
        String metageneration;
    }
}
