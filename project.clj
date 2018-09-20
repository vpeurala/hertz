(defproject hertz "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [overtone "0.10.3"]
                 [try-let "1.2.0"]]
  :main ^:skip-aot hertz.core
  :native-path "native"
  :target-path "target/%s"
  :jvm-opts ^:replace []
  :profiles {:uberjar {:aot :all}}
  :repl-options {:timeout 120000})
