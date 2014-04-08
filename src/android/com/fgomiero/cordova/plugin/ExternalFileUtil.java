/**
 * 
 */
package com.fgomiero.cordova.plugin;

import java.io.IOException;
import java.net.URLConnection;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.net.Uri;

/**
 * @author Fabio Gomiero
 * 
 */
public class ExternalFileUtil extends CordovaPlugin {

	/* (non-Javadoc)
	 * @see org.apache.cordova.CordovaPlugin#execute(java.lang.String, org.json.JSONArray, org.apache.cordova.CallbackContext)
	 */
	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
		try {
            if (action.equals("openWith")) {
                openFile(args.getString(0));
                callbackContext.success();
            }
        } catch (JSONException e) {
        	callbackContext.error(e.getLocalizedMessage());
        } catch (IOException e) {
            callbackContext.error(e.getLocalizedMessage());
        }
		return false;
	}

	/**
	 * 
	 * @param url
	 * @throws IOException
	 */
	private void openFile(String url) throws IOException {
		// Create URI
		final CordovaResourceApi resourceApi = webView.getResourceApi();

		Uri tmpTarget = Uri.parse(url);
		final Uri uri = resourceApi.remapUri(tmpTarget.getScheme() != null ? tmpTarget : Uri.fromFile(new File(url)));

		final String mime = URLConnection.guessContentTypeFromName(uri.toString());
		intent = new Intent(Intent.ACTION_VIEW);
		intent.setDataAndType(uri, mime);

		this.cordova.getActivity().startActivity(intent);
	}
}
