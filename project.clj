(defproject net.tbt-post/sentry-tiny (-> "VERSION" slurp .trim)
  :description "Tiny Sentry Interface for Clojure"
  :url "https://github.com/source-c/sentry-tiny"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[cheshire "5.10.1"]
                 [http-kit "2.5.3"]
                 [clj-time "0.15.2"]])
