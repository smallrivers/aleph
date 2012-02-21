(defproject aleph "0.2.1-SNAPSHOT"
  :description "a framework for asynchronous communication"
  :repositories {"jboss" "http://repository.jboss.org/nexus/content/groups/public/"}
  :license {:name "Eclipse Public License - v 1.0"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [org.clojure/tools.logging "0.2.3"]
                 [cheshire "2.2.0"]
                 [org.clojure.contrib/prxml "1.3.0-alpha4"]
                 [org.clojure.contrib/seq "1.3.0-alpha4"]
                 [org.jboss.netty/netty "3.2.5.Final"]
                 [clj-http "0.1.3"]
                 [org.clojars.smallrivers/lamina "0.4.1-SNAPSHOT"]
                 [gloss "0.2.1-20111019.122151-3"]
                 [user-agent-utils "1.2.3"]
                 [potemkin "0.1.1-20111019.122151-1"]]
  :exclusions    [lamina]
  :jvm-opts ["-server" "-XX:+UseConcMarkSweepGC"])
