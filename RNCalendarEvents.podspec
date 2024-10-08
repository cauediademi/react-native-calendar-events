require "json"

package = JSON.parse(File.read(File.join(__dir__, "package.json")))

Pod::Spec.new do |s|
  s.name         = 'RNCalendarEvents'
  s.dependency 'React-Core'
  
  s.version         = package["version"]
  s.license         = package["license"]
  s.summary         = package["description"]
  s.authors         = package["author"]
  s.homepage        = package["homepage"]
  s.platform        = :ios, '14.0'
  s.source          = { :git => package["repository"]["url"], :tag => s.version }
  s.source_files    = "ios/**/*.{h,m,mm,swift}"

  install_modules_dependencies(s)
end
